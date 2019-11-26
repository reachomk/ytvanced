package defpackage;

import android.database.Cursor;

/* renamed from: agiv */
public final class agiv {
    private final Cursor a;
    private final int b;

    agiv(Cursor cursor) {
        this.a = (Cursor) amqw.a((Object) cursor);
        this.b = cursor.getColumnIndexOrThrow("player_response_proto");
    }

    /* Access modifiers changed, original: final */
    public final aakj a() {
        if (!this.a.isNull(this.b)) {
            aakj a = aakj.a(this.a.getBlob(this.b), 0);
            if (a == null || !a.k()) {
                return null;
            }
            return a;
        }
        return null;
    }
}
