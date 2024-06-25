package kr.hs.dgsw.clock_server.domain.routine.scheduler;

import kr.hs.dgsw.clock_server.domain.routine.service.RoutineService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoScheduler {

    private final RoutineService routineService;

    @Scheduled(cron = "0 0 0 * * ?")
    public void createDailyTodos() {
        routineService.createDailyRoutine();
    }

//    @Scheduled(fixedRate = 30000) // 30초마다 실행
//    public void createDailyTodos2() {
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Scheduled task executed at: " + now);
//        routineService.createDailyRoutine();
//    }
}
