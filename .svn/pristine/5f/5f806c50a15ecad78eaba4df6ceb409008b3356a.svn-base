package cn.utils;


import java.util.List;

public class Page<T> {
	private Integer pageNum;// 当前的页数,第？页
	private Integer totalCount;// 总条数，总共有多少记录数
	private Integer rowNum;// 当前行数，
	public static final Integer pageCount = 5;// 一页？条
	private Integer totalPage;// 总页数，通过总条数计算的总页数
	private List<T> list;// 每页的数据

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		// 空，<=0,>totalPage
		if (pageNum == null) {
			this.pageNum = 1;
		} else {
			if (pageNum >= totalPage) {
				this.pageNum = totalPage;
				pageNum = totalPage;
			} else {
				this.pageNum = pageNum;
			}

			if (pageNum <= 0) {
				this.pageNum = 1;
			}
		}
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getRowNum() {
		return rowNum;
	}

	public void setRowNum() {
		this.rowNum = pageCount * (pageNum - 1);
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage() {
		this.totalPage = (totalCount % pageCount == 0) ? (totalCount / pageCount) : (totalCount / pageCount) + 1;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Page [pageNum=" + pageNum + ", totalCount=" + totalCount + ", rowNum=" + rowNum + ", totalPage="
				+ totalPage + "]";
	}

}
