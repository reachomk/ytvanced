package com.google.android.apps.youtube.app.application.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.FileObserver;
import android.os.ParcelFileDescriptor;
import defpackage.aefi;
import defpackage.afng;
import defpackage.ageo;
import defpackage.ahhv;
import defpackage.alyu;
import defpackage.anbk;
import defpackage.dsx;
import defpackage.dsz;
import defpackage.dta;
import defpackage.dtb;
import defpackage.dtc;
import defpackage.dtd;
import defpackage.dtf;
import defpackage.ebn;
import defpackage.saa;
import defpackage.utl;
import defpackage.xay;
import defpackage.xfc;
import defpackage.xse;
import defpackage.xti;
import defpackage.xtl;
import defpackage.xul;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class YouTubeBackupAgent extends saa implements xfc {
    public static final Class[] a = new Class[]{ebn.class, ahhv.class, utl.class, xay.class, ageo.class, alyu.class, afng.class, aefi.class};
    private static final Map c;
    public xti b;
    private dsx d;

    public static boolean a(xti xti) {
        return xti == null || xti.a("enable_backup_and_restore", true);
    }

    public static OnSharedPreferenceChangeListener a(Context context) {
        dtb dtb = new dtb(context);
        context.getSharedPreferences("youtube", 0).registerOnSharedPreferenceChangeListener(dtb);
        return dtb;
    }

    public static FileObserver b(Context context) {
        dtd dtd = new dtd(context.getDatabasePath("identity.db").getPath(), context);
        dtd.startWatching();
        return dtd;
    }

    private final dsx b() {
        if (this.d == null) {
            Context applicationContext = getApplicationContext();
            if (applicationContext instanceof xfc) {
                dta dta = (dta) xse.a(applicationContext);
                if (dta == null) {
                    xtl.d("AutoBackup component factory not initialized");
                    return null;
                }
                this.d = dta.a(new dsz());
            } else {
                xtl.d("AutoBackup doesn't have correct application context");
                return null;
            }
        }
        return this.d;
    }

    public static void c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("youtube", 0);
        if (sharedPreferences.getBoolean("got_future_restore", false) && xul.c(context) >= sharedPreferences.getInt("future_restore_version", Integer.MAX_VALUE)) {
            dtc dtc = new dtc(sharedPreferences);
            xtl.e("Triggering manual restore.");
            new BackupManager(context).requestRestore(dtc);
        }
    }

    public final void onCreate() {
        dsx b = b();
        if (b == null) {
            xtl.d("Skipping auto-backup due to unknown component");
            return;
        }
        b.a(this);
        if (a(this.b)) {
            addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, new String[]{"persistent_backup_agent_helper"}));
            addHelper("DATABASES", new FileBackupHelper(this, new String[]{"identity.db"}));
        }
    }

    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (a(this.b)) {
            File c = c();
            File d = d();
            a(c, d);
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            a(d);
        }
    }

    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        if (a(this.b)) {
            Context applicationContext = getApplicationContext();
            int c = xul.c(applicationContext);
            if (c != 0) {
                if (i > c) {
                    applicationContext.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", true).putInt("future_restore_version", i).apply();
                    xtl.e("Restore from future version skipped - will trigger a manual restore at next update.");
                    return;
                }
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
                xtl.e("Restore initiated.");
                File d = d();
                a(d, c());
                a(d);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Map a() {
        return c;
    }

    public static void d(Context context) {
        BackupManager.dataChanged(context.getPackageName());
        context.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", false).apply();
    }

    private final File c() {
        return getDatabasePath("identity.db");
    }

    private final File d() {
        return new File(getFilesDir(), "identity.db");
    }

    private static void a(File file, File file2) {
        try {
            anbk.a(file, file2);
        } catch (IOException unused) {
            xtl.e("Unable to copy identity database.");
        }
    }

    private static void a(File file) {
        if (!file.delete()) {
            xtl.e("Unable to delete identity database file from files directory.");
        }
    }

    public final /* synthetic */ Object n() {
        return b();
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("youtube", dtf.a);
        c = hashMap;
    }
}
