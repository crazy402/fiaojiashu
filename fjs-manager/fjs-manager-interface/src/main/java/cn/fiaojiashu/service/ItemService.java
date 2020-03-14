package cn.fiaojiashu.service;

import cn.fiaojiashu.common.pojo.EasyUIDataGridResult;
import cn.fiaojiashu.pojo.TbItem;

/**
 * @ClassName: ItemService
 * @Date: 2020/3/12 08:19
 * @Description:
 */
public interface ItemService {

    TbItem geiItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}
