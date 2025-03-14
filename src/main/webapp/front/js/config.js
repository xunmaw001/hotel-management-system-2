
var projectName = '酒店管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '酒店信息',
	url: './pages/jiudianxinxi/list.html'
}, 
{
	name: '客房信息',
	url: './pages/kefangxinxi/list.html'
}, 
{
	name: '酒店餐饮',
	url: './pages/jiudiancanyin/list.html'
}, 

{
	name: '酒店资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmr56vv/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客房分类","menuJump":"列表","tableName":"kefangfenlei"}],"menu":"客房分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","添加餐饮"],"menu":"酒店信息","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"客房信息","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"酒店餐饮","menuJump":"列表","tableName":"jiudiancanyin"}],"menu":"酒店餐饮管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","修改","删除","审核","报表"],"menu":"客房预订","menuJump":"列表","tableName":"kefangyuding"}],"menu":"客房预订管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"客房续订","menuJump":"列表","tableName":"kefangxuding"}],"menu":"客房续订管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"退房评价","menuJump":"列表","tableName":"tuifangpingjia"}],"menu":"退房评价管理"},{"child":[{"buttons":["查看","修改","删除","审核","报表","餐饮配送"],"menu":"餐饮订单","menuJump":"列表","tableName":"canyindingdan"}],"menu":"餐饮订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"餐饮配送","menuJump":"列表","tableName":"canyinpeisong"}],"menu":"餐饮配送管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"酒店资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"酒店信息列表","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息模块"},{"child":[{"buttons":["查看","客房预订"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"},{"child":[{"buttons":["查看","下单点餐"],"menu":"酒店餐饮列表","menuJump":"列表","tableName":"jiudiancanyin"}],"menu":"酒店餐饮模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付","客房续订","退房评价"],"menu":"客房预订","menuJump":"列表","tableName":"kefangyuding"}],"menu":"客房预订管理"},{"child":[{"buttons":["查看","支付"],"menu":"客房续订","menuJump":"列表","tableName":"kefangxuding"}],"menu":"客房续订管理"},{"child":[{"buttons":["查看"],"menu":"退房评价","menuJump":"列表","tableName":"tuifangpingjia"}],"menu":"退房评价管理"},{"child":[{"buttons":["查看","支付"],"menu":"餐饮订单","menuJump":"列表","tableName":"canyindingdan"}],"menu":"餐饮订单管理"},{"child":[{"buttons":["查看"],"menu":"餐饮配送","menuJump":"列表","tableName":"canyinpeisong"}],"menu":"餐饮配送管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"酒店信息列表","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息模块"},{"child":[{"buttons":["查看","客房预订"],"menu":"客房信息列表","menuJump":"列表","tableName":"kefangxinxi"}],"menu":"客房信息模块"},{"child":[{"buttons":["查看","下单点餐"],"menu":"酒店餐饮列表","menuJump":"列表","tableName":"jiudiancanyin"}],"menu":"酒店餐饮模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
