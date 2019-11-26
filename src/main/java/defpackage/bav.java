package defpackage;

import android.content.ComponentName;

/* renamed from: bav */
public final class bav {
    public final ComponentName a;

    bav(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProviderMetadata{ componentName=");
        stringBuilder.append(this.a.flattenToShortString());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
