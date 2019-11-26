package defpackage;

import android.database.Cursor;

/* renamed from: agfq */
public final class agfq {
    public final Cursor a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public agfq(Cursor cursor) {
        this.a = (Cursor) amqw.a((Object) cursor);
        this.b = cursor.getColumnIndexOrThrow("video_id");
        this.c = cursor.getColumnIndexOrThrow("itag");
        this.d = cursor.getColumnIndexOrThrow("storage_id");
        this.e = cursor.getColumnIndexOrThrow("merkle_level");
        this.f = cursor.getColumnIndexOrThrow("block_index");
        this.g = cursor.getColumnIndexOrThrow("digest");
        this.h = cursor.getColumnIndexOrThrow("hash_state");
        this.i = cursor.getColumnIndexOrThrow("matches_bytes_on_disk");
    }

    public final agqd a() {
        String string = this.a.getString(this.b);
        int i = this.a.getInt(this.c);
        String string2 = this.a.getString(this.d);
        int i2 = this.a.getInt(this.e);
        int i3 = this.a.getInt(this.f);
        byte[] blob = this.a.getBlob(this.g);
        byte[] blob2 = this.a.getBlob(this.h);
        boolean a = xbs.a(this.a, this.i, true);
        agqg agqg = new agqg();
        agqg.a = string;
        agqg.b = i;
        agqg.c = string2;
        agqg.d = i2;
        agqg.e = i3;
        agqg.f = blob;
        agqg.g = blob2;
        agqg.h = a;
        return agqg.a();
    }
}
