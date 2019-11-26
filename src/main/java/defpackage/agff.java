package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: agff */
final class agff implements agga {
    private final /* synthetic */ agfd a;

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("playlistsV13", "placeholder = ?", new String[]{xbs.a(true).toString()});
    }

    public final void a() {
        this.a.a.a();
    }

    /* synthetic */ agff(agfd agfd) {
        this.a = agfd;
    }
}
