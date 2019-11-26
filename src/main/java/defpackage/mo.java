package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: mo */
final class mo implements Runnable {
    private final /* synthetic */ String[] a;
    private final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    mo(String[] strArr, Activity activity, int i) {
        this.a = strArr;
        this.b = activity;
        this.c = i;
    }

    public final void run() {
        int[] iArr = new int[this.a.length];
        PackageManager packageManager = this.b.getPackageManager();
        String packageName = this.b.getPackageName();
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.a[i], packageName);
        }
        ((mr) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
    }
}
