import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: Home
  },
  {
    path: "/about",
    name: "about",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue")
  },
  {
    path: "/user/edit",
    name: "userEdit",
    component: () =>
      import(/* webpackChunkName: "userEdit" */ "../components/user/UserEdit")
  },
  {
    path: "/article/free/new",
    name: "freeArticleEdit",
    component: () =>
      import(
        /* webpackChunkName: "articleEdit" */ "../components/article/ArticleEdit"
      )
  },
  {
    path: "/article/crew/new",
    name: "crewArticleEdit",
    component: () =>
      import(
        /* webpackChunkName: "articleEdit" */ "../components/article/ArticleEdit"
      )
  },
  {
    path: "/articles/:articleId",
    name: "freeArticleView",
    component: () =>
      import(
        /* webpackChunkName: "articleView" */ "../components/article/ArticleView"
      )
  },
  {
    path: "/articles/crew/:articleId",
    name: "crewArticleView",
    component: () =>
      import(
        /* webpackChunkName: "articleView" */ "../components/article/ArticleView"
      )
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
