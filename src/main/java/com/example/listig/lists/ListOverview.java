package com.example.listig.lists;

import java.time.LocalDateTime;

public record ListOverview(Long id, String name, String desc, String owner, int users, ListType type,LocalDateTime createdAt, LocalDateTime lastEdit) {
}
