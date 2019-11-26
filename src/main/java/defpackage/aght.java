package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aght */
public final class aght {
    private final Cursor a;
    private final agpi b;
    private final agew c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    aght(Cursor cursor, agpi agpi, agew agew) {
        this.a = (Cursor) amqw.a((Object) cursor);
        this.b = (agpi) amqw.a((Object) agpi);
        this.c = agew;
        this.d = cursor.getColumnIndexOrThrow("id");
        this.e = cursor.getColumnIndexOrThrow("offline_video_data_proto");
        this.f = cursor.getColumnIndexOrThrow("deleted");
        this.g = cursor.getColumnIndexOrThrow("channel_id");
        this.h = cursor.getColumnIndex("video_id");
    }

    /* Access modifiers changed, original: final */
    public final agqp a() {
        avrd avrd;
        agpy agpy = null;
        if (this.a.isNull(this.d)) {
            int i = this.h;
            if (i >= 0) {
                avrd = (avrd) avre.p.createBuilder();
                avrd.a(this.a.getString(i));
                return new agqp((avre) ((anxl) avrd.build()), true, null, null);
            }
        }
        String string = this.a.getString(this.d);
        avrd = (avrd) avre.p.createBuilder();
        try {
            avrd.mergeFrom(this.a.getBlob(this.e), anxa.c());
        } catch (anyg e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 34);
            stringBuilder.append("Error loading proto for videoId=[");
            stringBuilder.append(string);
            stringBuilder.append("]");
            xtl.a(stringBuilder.toString(), e);
            avrd = (avrd) avre.p.createBuilder();
            avrd.a(string);
        }
        boolean a = xbs.a(this.a, this.f, false);
        aaft aaft = new aaft();
        avre avre = (avre) avrd.instance;
        if ((avre.a & 2) != 0) {
            agpi agpi = this.b;
            aygk aygk = avre.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aaft = agpi.a(string, new aaft(aygk));
        }
        string = this.a.getString(this.g);
        if (string != null) {
            agew agew = this.c;
            if (agew != null) {
                agpy = agew.a(string);
            }
        }
        if (agpy == null) {
            agpy = agpy.a(avrd.a());
        }
        return new agqp((avre) ((anxl) avrd.build()), a, aaft, agpy);
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
