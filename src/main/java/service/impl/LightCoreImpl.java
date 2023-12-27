package service.impl;

import entity.LightCore;

import java.util.List;

public interface LightCoreImpl {
    List<LightCore> findAll();

    List<LightCore> findByPath(String path);
}
