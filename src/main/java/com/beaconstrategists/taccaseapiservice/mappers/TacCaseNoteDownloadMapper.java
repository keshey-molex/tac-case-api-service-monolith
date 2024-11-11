package com.beaconstrategists.taccaseapiservice.mappers;

import com.beaconstrategists.taccaseapiservice.controllers.dto.TacCaseNoteDownloadDto;
import com.beaconstrategists.taccaseapiservice.model.entities.TacCaseNoteEntity;

public interface TacCaseNoteDownloadMapper {
    TacCaseNoteDownloadDto mapTo(TacCaseNoteEntity entity);
}