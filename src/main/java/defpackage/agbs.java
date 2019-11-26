package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: agbs */
public final class agbs implements agwb {
    private final bcaa a;
    private final bcaa b;
    private final agbg c;

    public agbs(bcaa bcaa, bcaa bcaa2, agbg agbg) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = agbg;
    }

    public final void a(List list, long j) {
        String str = "subscriptionsV31";
        if (this.c.v()) {
            agew agew = (agew) this.a.get();
            SQLiteDatabase a = agew.a.a();
            try {
                a.beginTransaction();
                for (agpy a2 : list) {
                    agew.a.a().insertWithOnConflict("channelsV13", null, agew.a(a2), 4);
                }
                a.setTransactionSuccessful();
                aghp aghp = (aghp) this.b.get();
                List<String> a3 = amvj.a(list, agbr.a);
                Long valueOf = Long.valueOf(j);
                SQLiteDatabase a4 = aghp.a.a();
                try {
                    a4.beginTransaction();
                    a4.delete(str, "client_modified_timestamp < ?", new String[]{valueOf.toString()});
                    for (String str2 : a3) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", str2);
                        contentValues.put("display_state", Integer.valueOf(1));
                        contentValues.put("should_sync_to_server", Boolean.valueOf(true));
                        contentValues.put("client_modified_timestamp", valueOf);
                        aghp.a.a().insertWithOnConflict(str, null, contentValues, 4);
                    }
                    a4.setTransactionSuccessful();
                } finally {
                    aghp.a(a4);
                }
            } finally {
                agew.a(a);
            }
        }
    }
}
