package com.nit.web.data;

import java.util.List;

public class PaginationResponseModel<T> {

    private List<T> items;
    private long totalCount;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public long getTotalCount() {
        return totalCount;
    }
 
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}