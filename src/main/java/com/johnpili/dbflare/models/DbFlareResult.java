package com.johnpili.dbflare.models;

import java.util.ArrayList;
import java.util.List;

public class DbFlareResult implements IDbFlareResult {
    private long total;
    private Object result;
    private long dbExecutionTime;
    public List<String> errors;
    public List<IField> fields;

    public DbFlareResult() {
        this.total = 0;
        this.result = null;
        this.dbExecutionTime = -1;
        this.errors = new ArrayList<>();
        this.fields = new ArrayList<>();
    }

    public DbFlareResult(Object result, String error) {
        this.result = result;
        this.dbExecutionTime = -1;
        this.fields = new ArrayList<>();
        this.errors = new ArrayList<>();
        this.errors.add(error);
    }

    public DbFlareResult(Object result, List<String> errors) {
        this.result = result;
        this.dbExecutionTime = -1;
        this.fields = new ArrayList<>();
        if (errors != null) {
            this.errors = errors;
        } else {
            this.errors = new ArrayList<>();
        }
    }

    @Override
    public Object getResult() {
        return this.result;
    }

    @Override
    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public long getDbExecutionTime() {
        return this.dbExecutionTime;
    }

    @Override
    public void setDbExecutionTime(long dbExecutionTime) {
        this.dbExecutionTime = dbExecutionTime;
    }

    @Override
    public List<String> getErrors() {
        return this.errors;
    }
}
