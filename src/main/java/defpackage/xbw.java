package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* renamed from: xbw */
public abstract class xbw extends SQLiteOpenHelper implements xbp {
    public final Context a;
    private final int b;

    public xbw(Context context, String str, int i) {
        super((Context) amqw.a((Object) context), str, null, i);
        this.a = context;
        this.b = i;
    }

    public abstract xbt a(int i);

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (int i = 0; i < this.b; i++) {
            a(i).a(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            try {
                a(i).a(sQLiteDatabase);
                i++;
            } catch (SQLException e) {
                xtl.a(String.format(Locale.US, "Error upgrading from %d to %d", new Object[]{Integer.valueOf(i - 1), Integer.valueOf(i)}), e);
                throw e;
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    /* Access modifiers changed, original: protected */
    public void a(SQLiteDatabase sQLiteDatabase) {
        xbs.a(sQLiteDatabase);
    }
}
