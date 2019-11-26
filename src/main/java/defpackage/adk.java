package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: adk */
final class adk implements Callback {
    private final Callback a;
    private final TextView b;
    private Class c;
    private Method d;
    private boolean e;
    private boolean f = false;

    adk(Callback callback, TextView textView) {
        this.a = callback;
        this.b = textView;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context = this.b.getContext();
        PackageManager packageManager = context.getPackageManager();
        String str = "removeItemAt";
        if (!this.f) {
            this.f = true;
            try {
                this.c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.d = this.c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                this.e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            Method method;
            MenuItem item;
            if (this.e && this.c.isInstance(menu)) {
                method = this.d;
            } else {
                method = menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE});
            }
            int size = menu.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                item = menu.getItem(size);
                if (item.getIntent() != null) {
                    if ("android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(adk.a(), 0)) {
                    if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                item = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.b;
                Intent a = adk.a();
                int i2 = ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) ? 1 : 0;
                item.setIntent(a.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", i2 ^ 1).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.a.onPrepareActionMode(actionMode, menu);
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    private static Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
}
