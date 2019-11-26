package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agfr */
final class agfr {
    private final Cursor a;
    private final agpi b;
    private final agew c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    agfr(Cursor cursor, agpi agpi, agew agew) {
        this.a = cursor;
        this.b = agpi;
        this.c = agew;
        this.d = cursor.getColumnIndexOrThrow("id");
        this.e = cursor.getColumnIndexOrThrow("offline_playlist_data_proto");
        this.f = cursor.getColumnIndexOrThrow("placeholder");
        this.g = cursor.getColumnIndexOrThrow("size");
        this.h = cursor.getColumnIndexOrThrow("channel_id");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    public final defpackage.agqi a() {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = r8.d;
        r0 = r0.getString(r1);
        r1 = r8.a;	 Catch:{ anyg -> 0x001d }
        r2 = r8.e;	 Catch:{ anyg -> 0x001d }
        r1 = r1.getBlob(r2);	 Catch:{ anyg -> 0x001d }
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x001d }
        r3 = defpackage.avoq.k;	 Catch:{ anyg -> 0x001d }
        r1 = defpackage.anxl.parseFrom(r3, r1, r2);	 Catch:{ anyg -> 0x001d }
        r1 = (defpackage.avoq) r1;	 Catch:{ anyg -> 0x001d }
        goto L_0x0054;
    L_0x001d:
        r1 = move-exception;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 37;
        r3.<init>(r2);
        r2 = "Error loading proto for playlistId=[";
        r3.append(r2);
        r3.append(r0);
        r2 = "]";
        r3.append(r2);
        r2 = r3.toString();
        defpackage.xtl.a(r2, r1);
        r1 = defpackage.avoq.k;
        r1 = r1.createBuilder();
        r1 = (defpackage.avop) r1;
        r1.a(r0);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.avoq) r1;
    L_0x0054:
        r2 = r8.a;
        r3 = r8.f;
        r4 = 0;
        r2 = defpackage.xbs.a(r2, r3, r4);
        r3 = r8.a;
        r4 = r8.g;
        r3 = r3.getInt(r4);
        r4 = r8.a;
        r5 = r8.h;
        r4 = r4.getString(r5);
        r5 = 0;
        if (r4 == 0) goto L_0x0079;
    L_0x0070:
        r6 = r8.c;
        if (r6 == 0) goto L_0x0079;
    L_0x0074:
        r4 = r6.a(r4);
        goto L_0x007a;
    L_0x0079:
        r4 = r5;
    L_0x007a:
        if (r4 == 0) goto L_0x007d;
    L_0x007c:
        goto L_0x008d;
    L_0x007d:
        r4 = r1.a;
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x0089;
    L_0x0083:
        r5 = r1.d;
        if (r5 != 0) goto L_0x0089;
    L_0x0087:
        r5 = defpackage.avnc.c;
    L_0x0089:
        r4 = defpackage.agpy.a(r5);
    L_0x008d:
        r5 = new aaft;
        r5.<init>();
        r6 = r8.b;
        r6 = r6.a(r1);
        if (r6 == 0) goto L_0x00a5;
    L_0x009a:
        r5 = r8.b;
        r7 = new aaft;
        r7.<init>(r6);
        r5 = r5.b(r0, r7);
    L_0x00a5:
        r0 = defpackage.agqi.a(r1, r2, r3, r5, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfr.a():agqi");
    }

    /* Access modifiers changed, original: final */
    public final List b() {
        ArrayList arrayList = new ArrayList(this.a.getCount());
        while (this.a.moveToNext()) {
            arrayList.add(a());
        }
        return arrayList;
    }
}
