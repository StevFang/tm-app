package com.qs.tm.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Task Manage Content Provider
 *
 * Created by fbin on 2018/3/31.
 */

public class TMContentProvider extends ContentProvider {

    /**
     * 处理初始化操作
     * @return
     */
    @Override
    public boolean onCreate() {
        return false;
    }

    /**
     * 返回数据给调用者(允许其他应用从你的应用中获取数据时重写)
     * @param uri
     * @param projection 列名
     * @param selection 条件语句
     * @param selectionArgs 参数
     * @param sortOrder 排序
     * @return
     */
    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection,
                        @Nullable String selection, @Nullable String[] selectionArgs,
                        @Nullable String sortOrder) {
        return null;
    }

    /**
     * 用于返回当前Uri所代表数据的MIME类型
     * 如果操作的数据为集合类型(多条数据),那么返回的类型字符串应该为vnd.android.cursor.dir/开头
     * 例如要得到所有person记录的Uri为content://com.bravestarr.provider.personprovider/person,
     * 那么返回的MIME类型字符串应该为"vnd.android.cursor.dir/person"
     * 如果操作的数据为单一数据,那么返回的类型字符串应该为vnd.android.cursor.item/开头
     * 例如要得到id为10的person记录的Uri为content://com.bravestarr.provider.personprovider/person/10,
     * 那么返回的MIME类型字符串应该为"vnd.android.cursor.item/person"
     * @param uri
     */
    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    /**
     * 插入数据到内容提供者(允许其他应用向你的应用中插入数据时重写)
     * @param uri
     * @param values 插入的数据
     * @return
     */
    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    /**
     * 从内容提供者中删除数据(允许其他应用删除你应用的数据时重写)
     * @param uri
     * @param selection 条件语句
     * @param selectionArgs 参数
     * @return
     */
    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    /**
     * 更新内容提供者已存在的数据(允许其他应用更新你应用的数据时重写)
     * @param uri
     * @param values 更新的数据
     * @param selection 条件语句
     * @param selectionArgs 参数
     * @return
     */
    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values,
                      @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
