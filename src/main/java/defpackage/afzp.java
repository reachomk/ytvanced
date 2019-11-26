package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afzp */
public final class afzp implements agvt {
    private final bcaa a;

    public afzp(bcaa bcaa) {
        this.a = bcaa;
    }

    public final agqd a(String str, int i, int i2, int i3) {
        xak.b();
        Cursor query = ((agfp) this.a.get()).b.a().query("hashes", agfp.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index = ?", new String[]{str, Integer.toString(i), Integer.toString(i2), Integer.toString(i3)}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                agqd a = new agfq(query).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final List a(String str, int i, int i2, int i3, int i4) {
        xak.b();
        Cursor query = ((agfp) this.a.get()).b.a().query("hashes", agfp.a, "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", new String[]{str, Integer.toString(i), Integer.toString(i2), Integer.toString(i3), Integer.toString(i4 - 1)}, null, null, "block_index", null);
        try {
            agfq agfq = new agfq(query);
            List i22 = new ArrayList();
            while (agfq.a.moveToNext()) {
                i22.add(agfq.a());
            }
            return i22;
        } finally {
            query.close();
        }
    }

    public final agqd a(String str, int i, int i2) {
        xak.b();
        Cursor query = ((agfp) this.a.get()).b.a().query("hashes", agfp.a, "video_id = ? AND itag = ? AND merkle_level = ?", new String[]{str, Integer.toString(i), Integer.toString(i2)}, null, null, "block_index DESC", "1");
        try {
            if (query.moveToNext()) {
                agqd a = new agfq(query).a();
                return a;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public final int a(String str, int i) {
        xak.b();
        SQLiteDatabase a = ((agfp) this.a.get()).b.a();
        String[] strArr = new String[1];
        String str2 = "merkle_level";
        strArr[0] = str2;
        Cursor query = a.query("hashes", strArr, "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)}, null, null, "merkle_level DESC", "1");
        try {
            i = query.getColumnIndexOrThrow(str2);
            if (query.moveToNext()) {
                i = query.getInt(i);
                return i;
            }
            query.close();
            return -1;
        } finally {
            query.close();
        }
    }

    public final void a(agqd agqd) {
        xak.b();
        agfp agfp = (agfp) this.a.get();
        agfp.b.a().replaceOrThrow("hashes", null, agfp.a(agqd));
    }

    public final void a(List list) {
        xak.b();
        SQLiteDatabase a = ((agfp) this.a.get()).b.a();
        a.beginTransaction();
        try {
            for (agqd a2 : list) {
                a.replaceOrThrow("hashes", null, agfp.a(a2));
            }
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }

    public final void b(String str, int i) {
        xak.b();
        SQLiteDatabase a = ((agfp) this.a.get()).b.a();
        r1 = new String[5];
        str = "0";
        r1[2] = str;
        r1[3] = str;
        r1[4] = "2147483646";
        a.delete("hashes", "video_id = ? AND itag = ? AND merkle_level = ? AND block_index BETWEEN ? AND ?", r1);
    }
}
