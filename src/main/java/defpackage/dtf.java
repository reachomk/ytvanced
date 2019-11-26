package defpackage;

import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: dtf */
public final class dtf {
    public static final rzx a;

    static {
        rzx[] rzxArr = new rzx[2];
        rzxArr[0] = new rzz(rzw.a(Backup.class, YouTubeBackupAgent.a));
        Set<String> a = rzw.a(SubstringBackup.class, YouTubeBackupAgent.a);
        HashSet<rzx> hashSet = new HashSet();
        for (String compile : a) {
            hashSet.add(new rzy(Pattern.compile(compile)));
        }
        ArrayList arrayList = new ArrayList();
        for (rzx add : hashSet) {
            arrayList.add(add);
        }
        rzxArr[1] = rzw.a(new ArrayList(arrayList));
        a = rzw.a(Arrays.asList(rzxArr));
    }
}
