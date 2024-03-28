package com.example.list.model;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
    }, CHECK{
        @Override
        public String toString() {
            return "Checklist";
        }
    }
}
