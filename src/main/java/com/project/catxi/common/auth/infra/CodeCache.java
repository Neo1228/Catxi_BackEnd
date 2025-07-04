package com.project.catxi.common.auth.infra;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class CodeCache {
  // 인증 코드와 만료시간을 저장
  private final Map<String, Instant> usedCodes = new ConcurrentHashMap<>();
  private static final long CODE_LIFETIME_SECONDS = 300; // 5분

  // 코드 중복 사용 여부 확인
  public boolean isDuplicate(String code) {
    cleanupExpiredCodes();
    return usedCodes.containsKey(code);
  }

  // 코드 등록 (사용 처리)
  public void register(String code) {
    usedCodes.put(code, Instant.now().plusSeconds(CODE_LIFETIME_SECONDS));
  }

  // 코드 삭제 (실패시 재시도 허용)
  public void remove(String code) {
    usedCodes.remove(code);
  }

  // 만료된 코드 정리 (메모리 관리)
  private void cleanupExpiredCodes() {
    Instant now = Instant.now();
    usedCodes.entrySet().removeIf(entry -> entry.getValue().isBefore(now));
  }
}
