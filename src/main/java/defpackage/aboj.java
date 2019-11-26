package defpackage;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import java.util.ArrayList;

/* renamed from: aboj */
public final class aboj extends AbstractCursor {
    private static final String[] b = new String[]{"_id", "suggest_text_1", "suggest_text_2", "suggest_intent_query"};
    public final ArrayList a = new ArrayList(10);

    public final String[] getColumnNames() {
        return b;
    }

    public final String getString(int i) {
        if (this.mPos < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (this.mPos >= this.a.size()) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        } else if (i == 3 || i == 1) {
            return ((abnv) this.a.get(this.mPos)).b;
        } else {
            return null;
        }
    }

    public final int getCount() {
        return this.a.size();
    }

    public final double getDouble(int i) {
        return Double.parseDouble(getString(i));
    }

    public final float getFloat(int i) {
        return Float.parseFloat(getString(i));
    }

    public final int getInt(int i) {
        return Integer.parseInt(getString(i));
    }

    public final long getLong(int i) {
        if (i != 0) {
            return Long.parseLong(getString(i));
        }
        return (long) this.mPos;
    }

    public final short getShort(int i) {
        return Short.parseShort(getString(i));
    }

    public final boolean isNull(int i) {
        return getString(i) == null;
    }
}
