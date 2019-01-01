package blcs.lwb.utils.manager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import java.util.ArrayList;

import blcs.lwb.utils.R;
import blcs.lwb.utils.fragment.AppUtilsFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.AnimationRecyclerFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.DragAndSwipeFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.EmptyViewFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.ExpandableItemFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.Header_FooterFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.ItemClickRecyclerFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.MultipleItemRecyclerFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.PullToRefreshFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.SectionFragment;
import blcs.lwb.utils.fragment.BaseAdapterFragment.UpFetchDataFragment;
import blcs.lwb.utils.fragment.BaseFragment;
import blcs.lwb.utils.fragment.BitmapUtilsFragment;
import blcs.lwb.utils.fragment.BottomNavigationFragment;
import blcs.lwb.utils.fragment.EditTextUtilsFragment;
import blcs.lwb.utils.fragment.IntentUtilsFragment;
import blcs.lwb.utils.fragment.JavaDesignPatternFragment;
import blcs.lwb.utils.fragment.LeakCanaryFragment;
import blcs.lwb.utils.fragment.MarqueeViewFragment;
import blcs.lwb.utils.fragment.MyFragment;
import blcs.lwb.utils.fragment.OnCrashFragment;
import blcs.lwb.utils.fragment.RecyclerViewFragment;
import blcs.lwb.utils.fragment.ScreenUtilsFragment;
import blcs.lwb.utils.fragment.StringUtilsFragment;
import blcs.lwb.utils.fragment.TurnTableViewFragment;
import blcs.lwb.utils.mvp.BaseFragmentActivity;

/**
 * 对所有片段操作的管理
 * @author WESTAKE
 *
 */
public class FramentManages
{
	private ArrayList<BaseFragment> list_Frament;// 保存当前Activity的Frament
	public FragmentManager fm;// 片段管理器
	/**
	 *  片段名
	 */
	public final static String Demo="我的片段";
	public final static String Umeng="友盟统计";
	public final static String Umeng_Package="友盟多渠道打包";
	public final static String APK_Sign="APK签名打包";
	public final static String Log_Utils="LogUtils";
	public final static String String_Utils="StringUtils";
	public final static String EditText_Utils="EditTextUtils";
	public final static String Intent_Utils="IntentUtils";
	public final static String App_Utils="AppUtils";
	public final static String Screen_Utils="ScreenUtils";
	public final static String Bitmap_Utils="BitmapUtils";
	public final static String RxToast="RxToast";
	public final static String BottomNavigation="BottomNavigationView";
	public final static String RecyclerView="RecyclerView";
	public final static String TurnTableView="转盘小游戏";
	public final static String JavaDesignPattern="Java常用设计模式";
	public final static String AnimationRecycler="AnimationRecycler";
	public final static String MultipleItemRecycler="MultipleItemRecycler";
	public final static String Header_FooterRecycler="Header/FooterRecycler";
	public final static String PullToRefreshRecycler="PullToRefreshRecycler";
	public final static String SectionRecycler="SectionRecycler";
	public final static String EmptyViewRecycler="EmptyViewRecycler";
	public final static String DragAndSwipeRecycler="DragAndSwipeRecycler";
	public final static String ItemClickRecycler="ItemClickRecycler";
	public final static String ExpandableItemRecycler="ExpandableItemRecycler";
	public final static String UpFetchDataRecycler="UpFetchDataRecycler";
	public final static String MarqueeView="跑马灯";
	public final static String CustomActivityOnCrash="全局异常捕获";
	public final static String LeakCanary="内存泄漏检测";

	/**
	 * 这个在Fragment中不能new出来,只能在Activity中new，每个Activity对应一个List_fragment来管理
	 */
	public FramentManages(BaseFragmentActivity activity)
	{
		list_Frament = new ArrayList<>();
		fm = activity.getSupportFragmentManager();
	}

	private BaseFragment getFrament(Activity activity, String alias)
	{
		switch (alias)
		{
			default:
				return null;
			case FramentManages.Demo:
            case FramentManages.Umeng:
            case FramentManages.Umeng_Package:
            case FramentManages.APK_Sign:
            case FramentManages.Log_Utils:
				return new MyFragment();
			case FramentManages.String_Utils:
				return new StringUtilsFragment();
			case FramentManages.EditText_Utils:
				return new EditTextUtilsFragment();
			case FramentManages.Intent_Utils:
				return new IntentUtilsFragment();
			case FramentManages.App_Utils:
				return new AppUtilsFragment();
			case FramentManages.Screen_Utils:
				return new ScreenUtilsFragment();
			case FramentManages.Bitmap_Utils:
				return new BitmapUtilsFragment();
			case FramentManages.RxToast:
				return new RxToastFragment();
			case FramentManages.BottomNavigation:
				return new BottomNavigationFragment();
			case FramentManages.RecyclerView:
				return new RecyclerViewFragment();
			case FramentManages.TurnTableView:
				return new TurnTableViewFragment();
			case FramentManages.JavaDesignPattern:
				return new JavaDesignPatternFragment();
			case FramentManages.AnimationRecycler:
				return new AnimationRecyclerFragment();
			case FramentManages.MultipleItemRecycler:
				return new MultipleItemRecyclerFragment();
			case FramentManages.Header_FooterRecycler:
				return new Header_FooterFragment();
			case FramentManages.PullToRefreshRecycler:
				return new PullToRefreshFragment();
			case FramentManages.SectionRecycler:
				return new SectionFragment();
			case FramentManages.EmptyViewRecycler:
				return new EmptyViewFragment();
			case FramentManages.DragAndSwipeRecycler:
				return new DragAndSwipeFragment();
			case FramentManages.ItemClickRecycler:
				return new ItemClickRecyclerFragment();
			case FramentManages.ExpandableItemRecycler:
				return new ExpandableItemFragment();
			case FramentManages.UpFetchDataRecycler:
				return new UpFetchDataFragment();
			case FramentManages.MarqueeView:
				return new MarqueeViewFragment();
			case FramentManages.CustomActivityOnCrash:
				return new OnCrashFragment();
			case FramentManages.LeakCanary:
				return new LeakCanaryFragment();
//			case FramentManages.UtilsDetail://工具详情界面
//				return new HomeTab1DetailFragment();
		}
	}

	/**
	 * 替换Frament 这里先删除再添加，完成替换操作
	 *
	 * @param viewId
	 *            Frament 放置的FramentLayout
	 * @param activity
	 * @param alias
	 *            别名
	 */
	public void replaceFrament(int viewId, BaseFragmentActivity activity, String alias)
	{
		BaseFragment base = getFrament(activity, alias);
		if (base == null)
		{
			return;
		}
		popBackStack();
		list_Frament.add(base);
		fm.beginTransaction()
				// 添加Frament
				.add(viewId, base,alias).addToBackStack(null)
				// 提交
				.commit();
	}

	/**
	 * 添加Frament
	 *
	 * @param viewId
	 *            Frament 放置的FramentLayout的id
	 * @param activity
	 *            对应的Activity
	 * @param alias
	 *            别名，用于管理Fragment的名字
	 * @param bundle
	 *            传递的参数，如果不传，设置null即可
	 * @param isAnim
	 *            是否添加动画
	 */
	public void addFrament(int viewId, BaseFragmentActivity activity, String alias,
                           Bundle bundle, boolean isAnim)
	{
		BaseFragment base = getFrament(activity, alias);
		if (base == null)
		{
			return;
		}

		list_Frament.add(base);
		if (bundle != null)
		{
			base.setArguments(bundle);
		}
		FragmentTransaction bt = fm.beginTransaction();
		if (isAnim)
		{
			// 添加动画
			bt.setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out,
					R.anim.push_right_in, R.anim.push_right_out);
		}
		// 添加Frament
		bt.add(viewId, base,alias)
				// 添加到后退栈中
				.addToBackStack(null)
				// 提交
				.commitAllowingStateLoss();
	}
	public void popBackStack()
	{
		if (list_Frament.size() > 1)
		{
			// 从后退栈中弹出
			fm.popBackStack();
			list_Frament.remove(list_Frament.size() - 1);
		}
	}

	/**
	 * 获取上一个片段
	 *
	 * @return
	 */
	public BaseFragment getLastFrament()
	{
		if (list_Frament.size() - 1 >= 0)
		{
			return list_Frament.get(list_Frament.size() - 1);
		} else
		{
			return null;
		}
	}

	/**
	 * 获取当前Activity的所有片段 Fragment
	 *
	 * @return
	 */
	public ArrayList<BaseFragment> getAllFrament()
	{
		return list_Frament;
	}

	/**
	 * 清除当前Activity的所有片段 Fragment
	 */
	public void clearAllFrament()
	{
		for (int i = 0; i < list_Frament.size(); i++)
		{
			popBackStack();
		}
		list_Frament.clear();
	}
}
