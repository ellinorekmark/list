package com.example.listig.lists;

public enum ListType {
    BASIC{
        @Override
        public String toString(){
            return "Basic";
        }
    },
    CHECK{
        @Override
        public String toString() {
            return "Check";
        }
    },
    COLOR{
        @Override
        public String toString() {
            return "Color";
        }
    },
    LINK{
        @Override
        public String toString() {
            return "Link";
        }
    },
    RANK{
        @Override
        public String toString() {
            return "Rank";
        }
    }

}
