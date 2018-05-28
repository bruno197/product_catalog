package com.brunofr.adapter;

import java.util.List;

public interface IAdapter<T, K> {
    public T toEntity(K dto);
    public List<T> toEntityList(List<K> dtoList);
}
