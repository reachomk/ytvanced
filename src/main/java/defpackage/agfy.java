package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: agfy */
public final class agfy extends xbw {
    public final xsc b;
    public final agpi c;
    private final agga d;
    private final zyw e;
    private final xto f = new agfx(this, "List<SchemaMigration>");

    public agfy(xsc xsc, Context context, agpi agpi, String str, agga agga, zyw zyw) {
        super(context, str, 36);
        this.b = xsc;
        this.c = agpi;
        this.d = agga;
        this.e = zyw;
        avnm a = ahda.a(this.e);
        if (a != null && a.k) {
            setWriteAheadLoggingEnabled(true);
            xbv.a(this, 60000);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final xbt a(int i) {
        boolean z = false;
        if (i >= 0 && i < 36) {
            z = true;
        }
        amqw.a(z);
        return (xbt) ((List) this.f.get()).get(i);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        agga agga = this.d;
        if (agga != null) {
            agga.a(sQLiteDatabase);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(SQLiteDatabase sQLiteDatabase) {
        xbs.a(sQLiteDatabase);
        agga agga = this.d;
        if (agga != null) {
            agga.a();
        }
    }
}
