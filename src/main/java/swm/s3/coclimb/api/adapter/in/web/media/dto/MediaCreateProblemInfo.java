package swm.s3.coclimb.api.adapter.in.web.media.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class MediaCreateProblemInfo {
    @NotNull
    private LocalDate clearDate;
    @NotNull
    private String gymName;
    @NotNull
    private String color;
    @NotNull
    private Boolean isClear;
    private String perceivedDifficulty;
    private String type;

    @Builder
    public MediaCreateProblemInfo(LocalDate clearDate, String gymName, String color, Boolean isClear, String perceivedDifficulty, String type) {
        this.clearDate = clearDate;
        this.gymName = gymName;
        this.color = color;
        this.isClear = isClear;
        this.perceivedDifficulty = perceivedDifficulty;
        this.type = type;
    }
}
