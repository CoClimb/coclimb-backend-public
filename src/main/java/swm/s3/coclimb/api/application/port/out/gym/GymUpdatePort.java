package swm.s3.coclimb.api.application.port.out.gym;

import swm.s3.coclimb.domain.Gym;

public interface GymUpdatePort {
    void save(Gym gym);
}