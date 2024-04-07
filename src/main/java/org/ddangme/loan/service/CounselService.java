package org.ddangme.loan.service;

import org.ddangme.loan.dto.CounselDTO.Request;
import org.ddangme.loan.dto.CounselDTO.Response;

public interface CounselService {

    Response create(Request request);

}