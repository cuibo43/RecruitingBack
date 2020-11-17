package com.bfs.backend.dao;

import com.bfs.backend.responseDomain.homeCandidate;

import java.text.ParseException;
import java.util.List;

public interface CandidateDAO{
    List<homeCandidate> getHomeCandidate(int id);
}
