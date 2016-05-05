package io.magentys.rest.missions;

import io.magentys.Mission;

public interface RestfulMission extends Mission<RestfulResponse> {

    RestfulMission withRequest(final RestfulRequest restfulRequest);

}
