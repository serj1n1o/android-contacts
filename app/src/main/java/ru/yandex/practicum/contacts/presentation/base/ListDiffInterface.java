package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T instanceClass);

    boolean equals(Object o);
}
