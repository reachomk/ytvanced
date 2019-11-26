package defpackage;

import android.database.Cursor;

/* renamed from: xbm */
final class xbm implements xbu {
    private final /* synthetic */ Cursor a;
    private final /* synthetic */ xbj b;

    xbm(xbj xbj, Cursor cursor) {
        this.b = xbj;
        this.a = cursor;
    }

    public final boolean hasNext() {
        if (!this.a.isClosed() && this.a.getCount() > 0 && !this.a.isLast()) {
            return true;
        }
        a();
        return false;
    }

    public final Object next() {
        this.a.moveToNext();
        return this.b.a(this.a.getBlob(0));
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void a() {
        if (!this.a.isClosed()) {
            this.a.close();
        }
    }
}
