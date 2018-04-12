package com.qs.tm.model;

/**
 * 任务
 *
 * Created by fbin on 2018/4/11.
 */
public class Task {

    private int taskId;

    //任务名称
    private String taskName;

    //任务简述
    private String taskSketch;

    private String taskStartTime;

    private String taskEndTime;

    private String taskCreator;

    private String taskCreateTime;

    private String taskValidFlag;

    private String taskDescription;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskSketch() {
        return taskSketch;
    }

    public void setTaskSketch(String taskSketch) {
        this.taskSketch = taskSketch;
    }

    public String getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(String taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public String getTaskCreator() {
        return taskCreator;
    }

    public void setTaskCreator(String taskCreator) {
        this.taskCreator = taskCreator;
    }

    public String getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(String taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public String getTaskValidFlag() {
        return taskValidFlag;
    }

    public void setTaskValidFlag(String taskValidFlag) {
        this.taskValidFlag = taskValidFlag;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
