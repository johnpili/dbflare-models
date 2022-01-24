package com.johnpili.dbflare.models;

import java.util.List;

public interface IDbFlareResult {
    Object getResult();

    void setResult(Object result);

    long getDbExecutionTime();

    void setDbExecutionTime(long dbExecutionTime);

    List<String> getErrors();
}
