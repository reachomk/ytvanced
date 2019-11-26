package defpackage;

import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* renamed from: pxw */
public class pxw {
    private final DataHolder a;
    private int b;
    private int c;

    public pxw(DataHolder dataHolder, int i) {
        int length;
        this.a = (DataHolder) pzr.a((Object) dataHolder);
        boolean z = true;
        int i2 = 0;
        boolean z2 = i >= 0 && i < this.a.e;
        pzr.a(z2);
        this.b = i;
        DataHolder dataHolder2 = this.a;
        if (i < 0 || i >= dataHolder2.e) {
            z = false;
        }
        pzr.a(z);
        while (true) {
            int[] iArr = dataHolder2.d;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == length) {
            i2--;
        }
        this.c = i2;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        Bundle bundle = dataHolder.b;
        if (bundle == null || !bundle.containsKey(str)) {
            str = String.valueOf(str);
            String str2 = "No such column: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new IllegalArgumentException(str);
        } else if (dataHolder.a()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i >= 0 && i < dataHolder.e) {
            return dataHolder.c[i2].getString(i, dataHolder.b.getInt(str));
        } else {
            throw new CursorIndexOutOfBoundsException(i, dataHolder.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxw) {
            pxw pxw = (pxw) obj;
            if (pzj.a(Integer.valueOf(pxw.b), Integer.valueOf(this.b)) && pzj.a(Integer.valueOf(pxw.c), Integer.valueOf(this.c)) && pxw.a == this.a) {
                return true;
            }
        }
        return false;
    }
}
