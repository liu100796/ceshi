package entity;

import java.util.ArrayList;
import java.util.List;

public class PageBean {
    //总记录数
    private int totalCount;

    //总页数
    private int totalPage;

    //当前页码
    private int currNo;

    //每页显示记录数
    private Integer pageSize;

    //他们信息集合
    private List<Books> list=new ArrayList();

    //总页数
    public int getTotalPage() {
        totalPage=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
        return totalPage;
    }

    public int getCurrNo() {
        return currNo;
    }

    public void setCurrNo(int currNo) {
        this.currNo = currNo;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
