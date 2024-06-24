package kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req;

import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SetState {
    State state;
}
