package com.example.list;

import java.util.List;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
        public String description(){
            return "Basic";
        }
        public List<String> options(){
            return List.of();
        }
    },
    CHECK{
        @Override
        public String toString() {
            return "Check";
        }
        public String description(){
            return "Checklist";
        }
    },
    COLOR{
        @Override
        public String toString() {
            return "Color";
        }
        public String description(){
            return "Color coded";
        }
    },
    LINK{
        @Override
        public String toString() {
            return "Link";
        }
        public String description(){
            return "Linked";
        }
    },
    RANK{
        @Override
        public String toString() {
            return "Rank";
        }
        public String description(){
            return "Ranked";
        }
    }

}
