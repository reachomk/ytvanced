package defpackage;

import android.database.Cursor;

/* renamed from: aget */
final class aget {
    public final Cursor a;
    private final agpi b;
    private final int c;
    private final int d;

    aget(Cursor cursor, agpi agpi) {
        this.a = cursor;
        this.b = agpi;
        this.c = cursor.getColumnIndexOrThrow("id");
        this.d = cursor.getColumnIndexOrThrow("offline_channel_data_proto");
    }

    /* Access modifiers changed, original: final */
    public final agpy a() {
        String string = this.a.getString(this.c);
        avnf avnf = (avnf) avnc.c.createBuilder();
        try {
            avnf.mergeFrom(this.a.getBlob(this.d), anxa.c());
            aaft aaft = new aaft();
            if ((avnf.a().a & 2) != 0) {
                aygk aygk = avnf.a().c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                aaft = new aaft(aygk);
                aaft c = this.b.c(string, aaft);
                if (!(c == null || c.a.isEmpty())) {
                    aaft = c;
                }
            }
            return agpy.a((avnc) ((anxl) avnf.build()), aaft);
        } catch (anyg e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(string).length() + 36);
            stringBuilder.append("Error loading proto for channelId=[");
            stringBuilder.append(string);
            stringBuilder.append("]");
            xtl.a(stringBuilder.toString(), e);
            return null;
        }
    }
}
