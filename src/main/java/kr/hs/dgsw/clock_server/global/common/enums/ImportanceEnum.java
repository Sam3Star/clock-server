package kr.hs.dgsw.clock_server.global.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ImportanceEnum {
    veryImportant,
    important,
    soso,
    baggy,
    less
}
