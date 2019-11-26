package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: abmw */
public final class abmw {
    public final SQLiteOpenHelper a;
    public final String[] b = new String[]{"0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"};

    public abmw(Context context) {
        this.a = new abmz(context);
    }
}
