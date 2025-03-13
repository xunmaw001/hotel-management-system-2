import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import kefangyuding from '@/views/modules/kefangyuding/list'
    import canyinpeisong from '@/views/modules/canyinpeisong/list'
    import kefangxinxi from '@/views/modules/kefangxinxi/list'
    import tuifangpingjia from '@/views/modules/tuifangpingjia/list'
    import canyindingdan from '@/views/modules/canyindingdan/list'
    import discussjiudianxinxi from '@/views/modules/discussjiudianxinxi/list'
    import jiudianxinxi from '@/views/modules/jiudianxinxi/list'
    import jiudiancanyin from '@/views/modules/jiudiancanyin/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import kefangfenlei from '@/views/modules/kefangfenlei/list'
    import discusskefangxinxi from '@/views/modules/discusskefangxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import discussjiudiancanyin from '@/views/modules/discussjiudiancanyin/list'
    import kefangxuding from '@/views/modules/kefangxuding/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '酒店资讯',
        component: news
      }
          ,{
	path: '/kefangyuding',
        name: '客房预订',
        component: kefangyuding
      }
          ,{
	path: '/canyinpeisong',
        name: '餐饮配送',
        component: canyinpeisong
      }
          ,{
	path: '/kefangxinxi',
        name: '客房信息',
        component: kefangxinxi
      }
          ,{
	path: '/tuifangpingjia',
        name: '退房评价',
        component: tuifangpingjia
      }
          ,{
	path: '/canyindingdan',
        name: '餐饮订单',
        component: canyindingdan
      }
          ,{
	path: '/discussjiudianxinxi',
        name: '酒店信息评论',
        component: discussjiudianxinxi
      }
          ,{
	path: '/jiudianxinxi',
        name: '酒店信息',
        component: jiudianxinxi
      }
          ,{
	path: '/jiudiancanyin',
        name: '酒店餐饮',
        component: jiudiancanyin
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/kefangfenlei',
        name: '客房分类',
        component: kefangfenlei
      }
          ,{
	path: '/discusskefangxinxi',
        name: '客房信息评论',
        component: discusskefangxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/chat',
        name: '客服管理',
        component: chat
      }
          ,{
	path: '/discussjiudiancanyin',
        name: '酒店餐饮评论',
        component: discussjiudiancanyin
      }
          ,{
	path: '/kefangxuding',
        name: '客房续订',
        component: kefangxuding
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
