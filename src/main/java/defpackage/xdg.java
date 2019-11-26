package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import java.util.List;

/* renamed from: xdg */
public final class xdg extends xdi {
    private final xdf b;

    xdg(PackageManager packageManager, xdf xdf) {
        super(packageManager);
        this.b = (xdf) amqw.a((Object) xdf);
    }

    public final ProviderInfo resolveContentProvider(String str, int i) {
        ProviderInfo resolveContentProvider = this.a.resolveContentProvider(str, i);
        xdf xdf = this.b;
        String str2 = "PatchedPackageManager";
        if (xdf.a(resolveContentProvider, i)) {
            if (resolveContentProvider.metaData == null) {
                xtl.b(str2, "patching ProviderInfo. Metadata was null");
                resolveContentProvider.metaData = new Bundle(xdf.a);
            } else {
                xtl.b(str2, "patching ProviderInfo. Metadata was not null");
                resolveContentProvider.metaData.putAll(xdf.a);
            }
        }
        if (this.b.a(resolveContentProvider, i)) {
            String valueOf = String.valueOf(resolveContentProvider);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 47);
            stringBuilder.append("resolveContentProvider flags: ");
            stringBuilder.append(i);
            stringBuilder.append(" ret: ");
            stringBuilder.append(valueOf);
            xtl.b(str2, stringBuilder.toString());
        }
        return resolveContentProvider;
    }

    public final /* bridge */ /* synthetic */ void verifyPendingInstall(int i, int i2) {
        this.a.verifyPendingInstall(i, i2);
    }

    public final /* bridge */ /* synthetic */ void updateInstantAppCookie(byte[] bArr) {
        this.a.updateInstantAppCookie(bArr);
    }

    public final /* bridge */ /* synthetic */ void setInstallerPackageName(String str, String str2) {
        this.a.setInstallerPackageName(str, str2);
    }

    public final /* bridge */ /* synthetic */ void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.a.setComponentEnabledSetting(componentName, i, i2);
    }

    public final /* bridge */ /* synthetic */ void setApplicationEnabledSetting(String str, int i, int i2) {
        this.a.setApplicationEnabledSetting(str, i, i2);
    }

    public final /* bridge */ /* synthetic */ void setApplicationCategoryHint(String str, int i) {
        this.a.setApplicationCategoryHint(str, i);
    }

    public final /* bridge */ /* synthetic */ ResolveInfo resolveService(Intent intent, int i) {
        return this.a.resolveService(intent, i);
    }

    public final /* bridge */ /* synthetic */ ResolveInfo resolveActivity(Intent intent, int i) {
        return this.a.resolveActivity(intent, i);
    }

    public final /* bridge */ /* synthetic */ void removePermission(String str) {
        this.a.removePermission(str);
    }

    public final /* bridge */ /* synthetic */ void removePackageFromPreferred(String str) {
        this.a.removePackageFromPreferred(str);
    }

    public final /* bridge */ /* synthetic */ List queryPermissionsByGroup(String str, int i) {
        return this.a.queryPermissionsByGroup(str, i);
    }

    public final /* bridge */ /* synthetic */ List queryIntentServices(Intent intent, int i) {
        return this.a.queryIntentServices(intent, i);
    }

    public final /* bridge */ /* synthetic */ List queryIntentContentProviders(Intent intent, int i) {
        return this.a.queryIntentContentProviders(intent, i);
    }

    public final /* bridge */ /* synthetic */ List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.a.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    public final /* bridge */ /* synthetic */ List queryIntentActivities(Intent intent, int i) {
        return this.a.queryIntentActivities(intent, i);
    }

    public final /* bridge */ /* synthetic */ List queryInstrumentation(String str, int i) {
        return this.a.queryInstrumentation(str, i);
    }

    public final /* bridge */ /* synthetic */ List queryContentProviders(String str, int i, int i2) {
        return this.a.queryContentProviders(str, i, i2);
    }

    public final /* bridge */ /* synthetic */ List queryBroadcastReceivers(Intent intent, int i) {
        return this.a.queryBroadcastReceivers(intent, i);
    }

    public final /* bridge */ /* synthetic */ boolean isSafeMode() {
        return this.a.isSafeMode();
    }

    public final /* bridge */ /* synthetic */ boolean isPermissionRevokedByPolicy(String str, String str2) {
        return this.a.isPermissionRevokedByPolicy(str, str2);
    }

    public final /* bridge */ /* synthetic */ boolean isInstantApp(String str) {
        return this.a.isInstantApp(str);
    }

    public final /* bridge */ /* synthetic */ boolean isInstantApp() {
        return this.a.isInstantApp();
    }

    public final /* bridge */ /* synthetic */ boolean hasSystemFeature(String str, int i) {
        return this.a.hasSystemFeature(str, i);
    }

    public final /* bridge */ /* synthetic */ boolean hasSystemFeature(String str) {
        return this.a.hasSystemFeature(str);
    }

    public final /* bridge */ /* synthetic */ XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getXml(str, i, applicationInfo);
    }

    public final /* bridge */ /* synthetic */ CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return this.a.getUserBadgedLabel(charSequence, userHandle);
    }

    public final /* bridge */ /* synthetic */ Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return this.a.getUserBadgedIcon(drawable, userHandle);
    }

    public final /* bridge */ /* synthetic */ Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return this.a.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    public final /* bridge */ /* synthetic */ CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getText(str, i, applicationInfo);
    }

    public final /* bridge */ /* synthetic */ String[] getSystemSharedLibraryNames() {
        return this.a.getSystemSharedLibraryNames();
    }

    public final /* bridge */ /* synthetic */ FeatureInfo[] getSystemAvailableFeatures() {
        return this.a.getSystemAvailableFeatures();
    }

    public final /* bridge */ /* synthetic */ List getSharedLibraries(int i) {
        return this.a.getSharedLibraries(i);
    }

    public final /* bridge */ /* synthetic */ ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.a.getServiceInfo(componentName, i);
    }

    public final /* bridge */ /* synthetic */ Resources getResourcesForActivity(ComponentName componentName) {
        return this.a.getResourcesForActivity(componentName);
    }

    public final /* bridge */ /* synthetic */ ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.a.getReceiverInfo(componentName, i);
    }

    public final /* bridge */ /* synthetic */ ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.a.getProviderInfo(componentName, i);
    }

    public final /* bridge */ /* synthetic */ List getPreferredPackages(int i) {
        return this.a.getPreferredPackages(i);
    }

    public final /* bridge */ /* synthetic */ int getPreferredActivities(List list, List list2, String str) {
        return this.a.getPreferredActivities(list, list2, str);
    }

    public final /* bridge */ /* synthetic */ PermissionInfo getPermissionInfo(String str, int i) {
        return this.a.getPermissionInfo(str, i);
    }

    public final /* bridge */ /* synthetic */ PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.a.getPermissionGroupInfo(str, i);
    }

    public final /* bridge */ /* synthetic */ List getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.a.getPackagesHoldingPermissions(strArr, i);
    }

    public final /* bridge */ /* synthetic */ String[] getPackagesForUid(int i) {
        return this.a.getPackagesForUid(i);
    }

    public final /* bridge */ /* synthetic */ int getPackageUid(String str, int i) {
        return this.a.getPackageUid(str, i);
    }

    public final /* bridge */ /* synthetic */ PackageInstaller getPackageInstaller() {
        return this.a.getPackageInstaller();
    }

    public final /* bridge */ /* synthetic */ int[] getPackageGids(String str, int i) {
        return this.a.getPackageGids(str, i);
    }

    public final /* bridge */ /* synthetic */ int[] getPackageGids(String str) {
        return this.a.getPackageGids(str);
    }

    public final /* bridge */ /* synthetic */ String getNameForUid(int i) {
        return this.a.getNameForUid(i);
    }

    public final /* bridge */ /* synthetic */ Intent getLeanbackLaunchIntentForPackage(String str) {
        return this.a.getLeanbackLaunchIntentForPackage(str);
    }

    public final /* bridge */ /* synthetic */ Intent getLaunchIntentForPackage(String str) {
        return this.a.getLaunchIntentForPackage(str);
    }

    public final /* bridge */ /* synthetic */ InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.a.getInstrumentationInfo(componentName, i);
    }

    public final /* bridge */ /* synthetic */ int getInstantAppCookieMaxBytes() {
        return this.a.getInstantAppCookieMaxBytes();
    }

    public final /* bridge */ /* synthetic */ byte[] getInstantAppCookie() {
        return this.a.getInstantAppCookie();
    }

    public final /* bridge */ /* synthetic */ String getInstallerPackageName(String str) {
        return this.a.getInstallerPackageName(str);
    }

    public final /* bridge */ /* synthetic */ List getInstalledPackages(int i) {
        return this.a.getInstalledPackages(i);
    }

    public final /* bridge */ /* synthetic */ List getInstalledApplications(int i) {
        return this.a.getInstalledApplications(i);
    }

    public final /* bridge */ /* synthetic */ Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getDrawable(str, i, applicationInfo);
    }

    public final /* bridge */ /* synthetic */ Drawable getDefaultActivityIcon() {
        return this.a.getDefaultActivityIcon();
    }

    public final /* bridge */ /* synthetic */ int getComponentEnabledSetting(ComponentName componentName) {
        return this.a.getComponentEnabledSetting(componentName);
    }

    public final /* bridge */ /* synthetic */ ChangedPackages getChangedPackages(int i) {
        return this.a.getChangedPackages(i);
    }

    public final /* bridge */ /* synthetic */ CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLabel(applicationInfo);
    }

    public final /* bridge */ /* synthetic */ ApplicationInfo getApplicationInfo(String str, int i) {
        return this.a.getApplicationInfo(str, i);
    }

    public final /* bridge */ /* synthetic */ int getApplicationEnabledSetting(String str) {
        return this.a.getApplicationEnabledSetting(str);
    }

    public final /* bridge */ /* synthetic */ List getAllPermissionGroups(int i) {
        return this.a.getAllPermissionGroups(i);
    }

    public final /* bridge */ /* synthetic */ ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return this.a.getActivityInfo(componentName, i);
    }

    public final /* bridge */ /* synthetic */ void extendVerificationTimeout(int i, int i2, long j) {
        this.a.extendVerificationTimeout(i, i2, j);
    }

    public final /* bridge */ /* synthetic */ String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.a.currentToCanonicalPackageNames(strArr);
    }

    public final /* bridge */ /* synthetic */ void clearPackagePreferredActivities(String str) {
        this.a.clearPackagePreferredActivities(str);
    }

    public final /* bridge */ /* synthetic */ void clearInstantAppCookie() {
        this.a.clearInstantAppCookie();
    }

    public final /* bridge */ /* synthetic */ int checkPermission(String str, String str2) {
        return this.a.checkPermission(str, str2);
    }

    public final /* bridge */ /* synthetic */ String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.a.canonicalToCurrentPackageNames(strArr);
    }

    public final /* bridge */ /* synthetic */ boolean canRequestPackageInstalls() {
        return this.a.canRequestPackageInstalls();
    }

    public final /* bridge */ /* synthetic */ void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.a.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    public final /* bridge */ /* synthetic */ boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.a.addPermissionAsync(permissionInfo);
    }

    public final /* bridge */ /* synthetic */ boolean addPermission(PermissionInfo permissionInfo) {
        return this.a.addPermission(permissionInfo);
    }

    public final /* bridge */ /* synthetic */ void addPackageToPreferred(String str) {
        this.a.addPackageToPreferred(str);
    }
}
