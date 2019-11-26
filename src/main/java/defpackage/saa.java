package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: saa */
public abstract class saa extends BackupAgentHelper {
    public abstract Map a();

    public void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, new String[]{"persistent_backup_agent_helper"}));
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map a = a();
        Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Entry entry : a.entrySet()) {
            String str = (String) entry.getKey();
            rzx rzx = (rzx) entry.getValue();
            if (saa.a(str)) {
                for (Entry entry2 : getSharedPreferences(str, 0).getAll().entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (rzx.a(str2)) {
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
                        stringBuilder.append(str);
                        stringBuilder.append("/");
                        stringBuilder.append(str2);
                        saa.a(edit, stringBuilder.toString(), value);
                    }
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 43);
                stringBuilder2.append("Unsupported shared preferences file name \"");
                stringBuilder2.append(str);
                stringBuilder2.append("\"");
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        b();
    }

    private static void a(Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            String str2 = "PersistentBackupAgentHe";
            String str3 = ".";
            String str4 = "Skipping restore of key ";
            Object obj2 = null;
            String valueOf;
            StringBuilder stringBuilder;
            if (obj instanceof Set) {
                Set<Object> set = (Set) obj;
                for (Object obj3 : set) {
                    if (!(obj3 instanceof String)) {
                        if (obj != null) {
                            obj2 = obj.getClass();
                        }
                        valueOf = String.valueOf(obj2);
                        stringBuilder = new StringBuilder((String.valueOf(str).length() + 82) + valueOf.length());
                        stringBuilder.append(str4);
                        stringBuilder.append(str);
                        stringBuilder.append(" because its value is a set containing an object of type ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(str3);
                        Log.w(str2, stringBuilder.toString());
                        return;
                    }
                }
                editor.putStringSet(str, set);
                return;
            }
            if (obj != null) {
                obj2 = obj.getClass();
            }
            valueOf = String.valueOf(obj2);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 69) + valueOf.length());
            stringBuilder.append(str4);
            stringBuilder.append(str);
            stringBuilder.append(" because its value is the unrecognized type ");
            stringBuilder.append(valueOf);
            stringBuilder.append(str3);
            Log.w(str2, stringBuilder.toString());
        }
    }

    private final void b() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap hashMap = new HashMap();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            int indexOf = str.indexOf("/");
            String str2 = "PersistentBackupAgentHe";
            if (indexOf < 0 || indexOf >= str.length() - 1) {
                StringBuilder stringBuilder = new StringBuilder(str.length() + 57);
                stringBuilder.append("Format of key \"");
                stringBuilder.append(str);
                stringBuilder.append("\" not understood, so skipping its restore.");
                Log.w(str2, stringBuilder.toString());
            } else {
                String substring = str.substring(0, indexOf);
                str = str.substring(indexOf + 1);
                Editor editor = (Editor) hashMap.get(substring);
                if (editor == null) {
                    if (saa.a(substring)) {
                        editor = getSharedPreferences(substring, 0).edit();
                        hashMap.put(substring, editor);
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(substring).length() + 52);
                        stringBuilder2.append("Skipping unsupported shared preferences file name \"");
                        stringBuilder2.append(substring);
                        stringBuilder2.append("\"");
                        Log.w(str2, stringBuilder2.toString());
                    }
                }
                saa.a(editor, str, value);
            }
        }
        for (Editor apply : hashMap.values()) {
            apply.apply();
        }
        hashMap.keySet();
        b();
    }

    private static boolean a(String str) {
        return (str.contains(File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) ? false : true;
    }
}
