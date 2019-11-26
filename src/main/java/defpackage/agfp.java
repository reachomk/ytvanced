package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agfp */
public final class agfp {
    public static final String[] a = new String[]{"video_id", "itag", "storage_id", "merkle_level", "block_index", "digest", "hash_state", "matches_bytes_on_disk"};
    public final agfd b;
    public final List c = new ArrayList();

    public agfp(agfd agfd) {
        this.b = agfd;
    }

    public static ContentValues a(agqd agqd) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", agqd.a());
        contentValues.put("itag", Integer.valueOf(agqd.b()));
        contentValues.put("storage_id", agqd.c());
        contentValues.put("merkle_level", Integer.valueOf(agqd.d()));
        contentValues.put("block_index", Integer.valueOf(agqd.e()));
        contentValues.put("digest", agqd.f());
        contentValues.put("hash_state", agqd.g());
        contentValues.put("matches_bytes_on_disk", Boolean.valueOf(agqd.h()));
        return contentValues;
    }
}
