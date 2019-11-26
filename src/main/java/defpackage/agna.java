package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: agna */
public final class agna extends xbw {
    private final xto b = new agmz("List<SchemaMigration>");

    public agna(Context context, String str) {
        super(context, str, 2);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.enableWriteAheadLogging();
    }

    /* Access modifiers changed, original: protected|final */
    public final xbt a(int i) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        amqw.a(z);
        return (xbt) ((List) this.b.get()).get(i);
    }
}
