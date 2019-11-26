package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aghx */
public final class aghx {
    private final Cursor a;
    private final int b;
    private final int c;
    private final int d;

    public aghx(Cursor cursor) {
        this.a = cursor;
        this.b = cursor.getColumnIndexOrThrow("id");
        this.c = cursor.getColumnIndexOrThrow("size");
        this.d = cursor.getColumnIndexOrThrow("type");
    }

    /* Access modifiers changed, original: final */
    public final agqr a() {
        return new agqr(this.a.getString(this.b), this.a.getInt(this.c), this.a.getInt(this.d));
    }

    public final List b() {
        ArrayList arrayList = new ArrayList(this.a.getCount());
        while (this.a.moveToNext()) {
            arrayList.add(a());
        }
        return arrayList;
    }
}
