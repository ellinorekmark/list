"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[518],{6879:(e,t,r)=>{r.d(t,{A:()=>a});var o=r(9217);class a{constructor(){this.baseUrl=o.C1}async sendPost(e,t,r){const o=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json",Authorization:"Basic "+r},body:JSON.stringify(t)});if(!o.ok){console.log(await o.json());const e=await o.json();throw new Error(e)}return await o.json()}async sendPostNoLogin(e,t){const r=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(t)});if(!r.ok){const e=await r.json();throw new Error(e)}return await r.json()}async sendGet(e,t){const r=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json",Authorization:"Basic "+t}});if(!r.ok)throw new Error(await r.json());return await r.json()}async sendGetNoAuth(e){const t=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json"}});if(!t.ok)throw new Error(await t.json());return await t.json()}async sendDelete(e,t,r){const o=await fetch(this.baseUrl+e,{method:"DELETE",headers:{"Content-Type":"application/json",Authorization:"Basic "+r},body:JSON.stringify(t)});if(!o.ok)throw new Error(await o.json());return await o.json()}}},9007:(e,t,r)=>{r.d(t,{A:()=>i});var o=r(5865),a=r(6446),n=(r(5043),r(579));const i=e=>{let{title:t}=e;return(0,n.jsx)(n.Fragment,{children:(0,n.jsxs)(a.A,{sx:{paddingTop:2,paddingRight:5,paddingLeft:5},children:[(0,n.jsx)(o.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond",color:"primary.main"},children:(0,n.jsx)("strong",{children:t})}),(0,n.jsx)("br",{})]})})}},6518:(e,t,r)=>{r.r(t),r.d(t,{default:()=>ue});var o=r(5043),a=r(6446),n=r(5721),i=r(1322),s=r(3851),l=r(8734),c=r(8587),d=r(8168),u=r(8387),p=r(8606),h=r(4535),f=r(8206),g=r(9662),m=r(579);const v=(0,g.A)((0,m.jsx)("path",{d:"M12 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0 2c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4z"}),"Person");var x=r(7056),b=r(2400);function y(e){return(0,b.Ay)("MuiAvatar",e)}(0,x.A)("MuiAvatar",["root","colorDefault","circular","rounded","square","img","fallback"]);var A=r(4162);const j=["alt","children","className","component","slots","slotProps","imgProps","sizes","src","srcSet","variant"],w=(0,h.Ay)("div",{name:"MuiAvatar",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[t.root,t[r.variant],r.colorDefault&&t.colorDefault]}})((e=>{let{theme:t}=e;return{position:"relative",display:"flex",alignItems:"center",justifyContent:"center",flexShrink:0,width:40,height:40,fontFamily:t.typography.fontFamily,fontSize:t.typography.pxToRem(20),lineHeight:1,borderRadius:"50%",overflow:"hidden",userSelect:"none",variants:[{props:{variant:"rounded"},style:{borderRadius:(t.vars||t).shape.borderRadius}},{props:{variant:"square"},style:{borderRadius:0}},{props:{colorDefault:!0},style:(0,d.A)({color:(t.vars||t).palette.background.default},t.vars?{backgroundColor:t.vars.palette.Avatar.defaultBg}:(0,d.A)({backgroundColor:t.palette.grey[400]},t.applyStyles("dark",{backgroundColor:t.palette.grey[600]})))}]}})),C=(0,h.Ay)("img",{name:"MuiAvatar",slot:"Img",overridesResolver:(e,t)=>t.img})({width:"100%",height:"100%",textAlign:"center",objectFit:"cover",color:"transparent",textIndent:1e4}),B=(0,h.Ay)(v,{name:"MuiAvatar",slot:"Fallback",overridesResolver:(e,t)=>t.fallback})({width:"75%",height:"75%"});const k=o.forwardRef((function(e,t){const r=(0,f.b)({props:e,name:"MuiAvatar"}),{alt:a,children:n,className:i,component:s="div",slots:l={},slotProps:h={},imgProps:g,sizes:v,src:x,srcSet:b,variant:k="circular"}=r,R=(0,c.A)(r,j);let z=null;const S=function(e){let{crossOrigin:t,referrerPolicy:r,src:a,srcSet:n}=e;const[i,s]=o.useState(!1);return o.useEffect((()=>{if(!a&&!n)return;s(!1);let e=!0;const o=new Image;return o.onload=()=>{e&&s("loaded")},o.onerror=()=>{e&&s("error")},o.crossOrigin=t,o.referrerPolicy=r,o.src=a,n&&(o.srcset=n),()=>{e=!1}}),[t,r,a,n]),i}((0,d.A)({},g,{src:x,srcSet:b})),T=x||b,O=T&&"error"!==S,E=(0,d.A)({},r,{colorDefault:!O,component:s,variant:k}),M=(e=>{const{classes:t,variant:r,colorDefault:o}=e,a={root:["root",r,o&&"colorDefault"],img:["img"],fallback:["fallback"]};return(0,p.A)(a,y,t)})(E),[P,L]=(0,A.A)("img",{className:M.img,elementType:C,externalForwardedProps:{slots:l,slotProps:{img:(0,d.A)({},g,h.img)}},additionalProps:{alt:a,src:x,srcSet:b,sizes:v},ownerState:E});return z=O?(0,m.jsx)(P,(0,d.A)({},L)):n||0===n?n:T&&a?a[0]:(0,m.jsx)(B,{ownerState:E,className:M.fallback}),(0,m.jsx)(w,(0,d.A)({as:s,ownerState:E,className:(0,u.A)(M.root,i),ref:t},R,{children:z}))}));var R=r(8163),z=r(2177);r(805);var S=r(6803);function T(e){return(0,b.Ay)("MuiToggleButtonGroup",e)}const O=(0,x.A)("MuiToggleButtonGroup",["root","selected","horizontal","vertical","disabled","grouped","groupedHorizontal","groupedVertical","fullWidth","firstButton","lastButton","middleButton"]);const E=o.createContext({});const M=o.createContext(void 0);function P(e){return(0,b.Ay)("MuiToggleButton",e)}const L=(0,x.A)("MuiToggleButton",["root","disabled","selected","standard","primary","secondary","sizeSmall","sizeMedium","sizeLarge","fullWidth"]),N=["children","className","color","disabled","exclusive","fullWidth","onChange","orientation","size","value"],W=(0,h.Ay)("div",{name:"MuiToggleButtonGroup",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[{["& .".concat(O.grouped)]:t.grouped},{["& .".concat(O.grouped)]:t["grouped".concat((0,S.A)(r.orientation))]},{["& .".concat(O.firstButton)]:t.firstButton},{["& .".concat(O.lastButton)]:t.lastButton},{["& .".concat(O.middleButton)]:t.middleButton},t.root,"vertical"===r.orientation&&t.vertical,r.fullWidth&&t.fullWidth]}})((e=>{let{ownerState:t,theme:r}=e;return(0,d.A)({display:"inline-flex",borderRadius:(r.vars||r).shape.borderRadius},"vertical"===t.orientation&&{flexDirection:"column"},t.fullWidth&&{width:"100%"},{["& .".concat(O.grouped)]:(0,d.A)({},"horizontal"===t.orientation?{["&.".concat(O.selected," + .").concat(O.grouped,".").concat(O.selected)]:{borderLeft:0,marginLeft:0}}:{["&.".concat(O.selected," + .").concat(O.grouped,".").concat(O.selected)]:{borderTop:0,marginTop:0}})},"horizontal"===t.orientation?{["& .".concat(O.firstButton,",& .").concat(O.middleButton)]:{borderTopRightRadius:0,borderBottomRightRadius:0},["& .".concat(O.lastButton,",& .").concat(O.middleButton)]:{marginLeft:-1,borderLeft:"1px solid transparent",borderTopLeftRadius:0,borderBottomLeftRadius:0}}:{["& .".concat(O.firstButton,",& .").concat(O.middleButton)]:{borderBottomLeftRadius:0,borderBottomRightRadius:0},["& .".concat(O.lastButton,",& .").concat(O.middleButton)]:{marginTop:-1,borderTop:"1px solid transparent",borderTopLeftRadius:0,borderTopRightRadius:0}},"horizontal"===t.orientation?{["& .".concat(O.lastButton,".").concat(L.disabled,",& .").concat(O.middleButton,".").concat(L.disabled)]:{borderLeft:"1px solid transparent"}}:{["& .".concat(O.lastButton,".").concat(L.disabled,",& .").concat(O.middleButton,".").concat(L.disabled)]:{borderTop:"1px solid transparent"}})})),D=o.forwardRef((function(e,t){const r=(0,f.b)({props:e,name:"MuiToggleButtonGroup"}),{children:a,className:n,color:i="standard",disabled:s=!1,exclusive:l=!1,fullWidth:h=!1,onChange:g,orientation:v="horizontal",size:x="medium",value:b}=r,y=(0,c.A)(r,N),A=(0,d.A)({},r,{disabled:s,fullWidth:h,orientation:v,size:x}),j=(e=>{const{classes:t,orientation:r,fullWidth:o,disabled:a}=e,n={root:["root","vertical"===r&&"vertical",o&&"fullWidth"],grouped:["grouped","grouped".concat((0,S.A)(r)),a&&"disabled"],firstButton:["firstButton"],lastButton:["lastButton"],middleButton:["middleButton"]};return(0,p.A)(n,T,t)})(A),w=o.useCallback(((e,t)=>{if(!g)return;const r=b&&b.indexOf(t);let o;b&&r>=0?(o=b.slice(),o.splice(r,1)):o=b?b.concat(t):[t],g(e,o)}),[g,b]),C=o.useCallback(((e,t)=>{g&&g(e,b===t?null:t)}),[g,b]),B=o.useMemo((()=>({className:j.grouped,onChange:l?C:w,value:b,size:x,fullWidth:h,color:i,disabled:s})),[j.grouped,l,C,w,b,x,h,i,s]),k=function(e){return o.Children.toArray(e).filter((e=>o.isValidElement(e)))}(a),R=k.length,z=e=>{const t=0===e,r=e===R-1;return t&&r?"":t?j.firstButton:r?j.lastButton:j.middleButton};return(0,m.jsx)(W,(0,d.A)({role:"group",className:(0,u.A)(j.root,n),ref:t,ownerState:A},y,{children:(0,m.jsx)(E.Provider,{value:B,children:k.map(((e,t)=>(0,m.jsx)(M.Provider,{value:z(t),children:e},t)))})}))}));var F=r(2018),G=r(6632),I=r(7040);function H(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:0,r=arguments.length>2&&void 0!==arguments[2]?arguments[2]:1;return(0,I.A)(e,t,r)}function U(e){if(e.type)return e;if("#"===e.charAt(0))return U(function(e){e=e.slice(1);const t=new RegExp(".{1,".concat(e.length>=6?2:1,"}"),"g");let r=e.match(t);return r&&1===r[0].length&&(r=r.map((e=>e+e))),r?"rgb".concat(4===r.length?"a":"","(").concat(r.map(((e,t)=>t<3?parseInt(e,16):Math.round(parseInt(e,16)/255*1e3)/1e3)).join(", "),")"):""}(e));const t=e.indexOf("("),r=e.substring(0,t);if(-1===["rgb","rgba","hsl","hsla","color"].indexOf(r))throw new Error((0,G.A)(9,e));let o,a=e.substring(t+1,e.length-1);if("color"===r){if(a=a.split(" "),o=a.shift(),4===a.length&&"/"===a[3].charAt(0)&&(a[3]=a[3].slice(1)),-1===["srgb","display-p3","a98-rgb","prophoto-rgb","rec-2020"].indexOf(o))throw new Error((0,G.A)(10,o))}else a=a.split(",");return a=a.map((e=>parseFloat(e))),{type:r,values:a,colorSpace:o}}function V(e){const{type:t,colorSpace:r}=e;let{values:o}=e;return-1!==t.indexOf("rgb")?o=o.map(((e,t)=>t<3?parseInt(e,10):e)):-1!==t.indexOf("hsl")&&(o[1]="".concat(o[1],"%"),o[2]="".concat(o[2],"%")),o=-1!==t.indexOf("color")?"".concat(r," ").concat(o.join(" ")):"".concat(o.join(", ")),"".concat(t,"(").concat(o,")")}function _(e,t){return e=U(e),t=H(t),"rgb"!==e.type&&"hsl"!==e.type||(e.type+="a"),"color"===e.type?e.values[3]="/".concat(t):e.values[3]=t,V(e)}var J=r(6236);function q(e,t){return void 0!==t&&void 0!==e&&(Array.isArray(t)?t.indexOf(e)>=0:e===t)}const K=["value"],Z=["children","className","color","disabled","disableFocusRipple","fullWidth","onChange","onClick","selected","size","value"],Q=(0,h.Ay)(J.A,{name:"MuiToggleButton",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:r}=e;return[t.root,t["size".concat((0,S.A)(r.size))]]}})((e=>{let t,{theme:r,ownerState:o}=e,a="standard"===o.color?r.palette.text.primary:r.palette[o.color].main;return r.vars&&(a="standard"===o.color?r.vars.palette.text.primary:r.vars.palette[o.color].main,t="standard"===o.color?r.vars.palette.text.primaryChannel:r.vars.palette[o.color].mainChannel),(0,d.A)({},r.typography.button,{borderRadius:(r.vars||r).shape.borderRadius,padding:11,border:"1px solid ".concat((r.vars||r).palette.divider),color:(r.vars||r).palette.action.active},o.fullWidth&&{width:"100%"},{["&.".concat(L.disabled)]:{color:(r.vars||r).palette.action.disabled,border:"1px solid ".concat((r.vars||r).palette.action.disabledBackground)},"&:hover":{textDecoration:"none",backgroundColor:r.vars?"rgba(".concat(r.vars.palette.text.primaryChannel," / ").concat(r.vars.palette.action.hoverOpacity,")"):_(r.palette.text.primary,r.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}},["&.".concat(L.selected)]:{color:a,backgroundColor:r.vars?"rgba(".concat(t," / ").concat(r.vars.palette.action.selectedOpacity,")"):_(a,r.palette.action.selectedOpacity),"&:hover":{backgroundColor:r.vars?"rgba(".concat(t," / calc(").concat(r.vars.palette.action.selectedOpacity," + ").concat(r.vars.palette.action.hoverOpacity,"))"):_(a,r.palette.action.selectedOpacity+r.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:r.vars?"rgba(".concat(t," / ").concat(r.vars.palette.action.selectedOpacity,")"):_(a,r.palette.action.selectedOpacity)}}}},"small"===o.size&&{padding:7,fontSize:r.typography.pxToRem(13)},"large"===o.size&&{padding:15,fontSize:r.typography.pxToRem(15)})})),X=o.forwardRef((function(e,t){const r=o.useContext(E),{value:a}=r,n=(0,c.A)(r,K),i=o.useContext(M),s=(0,F.A)((0,d.A)({},n,{selected:q(e.value,a)}),e),l=(0,f.b)({props:s,name:"MuiToggleButton"}),{children:h,className:g,color:v="standard",disabled:x=!1,disableFocusRipple:b=!1,fullWidth:y=!1,onChange:A,onClick:j,selected:w,size:C="medium",value:B}=l,k=(0,c.A)(l,Z),R=(0,d.A)({},l,{color:v,disabled:x,disableFocusRipple:b,fullWidth:y,size:C}),z=(e=>{const{classes:t,fullWidth:r,selected:o,disabled:a,size:n,color:i}=e,s={root:["root",o&&"selected",a&&"disabled",r&&"fullWidth","size".concat((0,S.A)(n)),i]};return(0,p.A)(s,P,t)})(R),T=i||"";return(0,m.jsx)(Q,(0,d.A)({className:(0,u.A)(n.className,z.root,g,T),disabled:x,focusRipple:!b,ref:t,onClick:e=>{j&&(j(e,B),e.defaultPrevented)||A&&A(e,B)},onChange:A,value:B,ownerState:R,"aria-pressed":w},k,{children:h}))}));var Y=r(1637),$=r(5865),ee=r(4208),te=r(3766),re=r(6605),oe=r(710),ae=r(1906),ne=r(835),ie=r(6879),se=r(9613),le=r(2680),ce=r(9007);const de=new ie.A;function ue(){const{loginDetails:e,user:t}=(0,o.useContext)(se.c),[r,c]=(0,o.useState)([]),[d,u]=(0,o.useState)([]),[p,h]=(0,o.useState)(!0),[f,g]=(0,o.useState)([]),v=(0,ne.Zp)(),[x,b]=o.useState("all"),y=e=>e.sort(((e,t)=>new Date(t.lastEdit)-new Date(e.lastEdit)));function A(e){v("/web/list/".concat(e))}function j(e){return 1===e.users}function w(e){return 1!==e.users}function C(e){return e.owner===t.username}return(0,o.useEffect)((()=>{(async()=>{try{const t=await de.sendGet("list/all",e),r=y(t);c(r),u(r)}catch(t){console.error("Error fetching data",t)}finally{h(!1)}})()}),[e]),(0,o.useEffect)((()=>{(()=>{const e=r.filter((e=>C(e))).filter((e=>null!==e.uuid));g(e)})()}),[r]),(0,m.jsx)(m.Fragment,{children:(0,m.jsxs)(a.A,{maxWidth:750,sx:{mx:"auto"},children:[(0,m.jsx)(ce.A,{title:"Lists"}),(0,m.jsx)(a.A,{sx:{paddingBottom:2},children:(0,m.jsxs)(D,{color:"primary",value:x,exclusive:!0,onChange:(e,t)=>{b(t),function(e){let t=[];switch(e){case"all":t=r;break;case"private":t=r.filter(j);break;case"shared":t=r.filter(w)}u(y(t))}(t)},"aria-label":"Filter",children:[(0,m.jsx)(X,{value:"private",children:"Private"}),(0,m.jsx)(X,{value:"all",children:"All"}),(0,m.jsx)(X,{value:"shared",children:"Shared"})]})}),p&&(0,m.jsx)(a.A,{sx:{display:"flex",justifyContent:"center",mt:4},children:(0,m.jsx)(Y.A,{})}),!p&&0===d.length&&(0,m.jsx)($.A,{variant:"h7",color:"textSecondary",align:"center",children:"Empty"}),!p&&d.length>0&&(0,m.jsx)(n.A,{dense:!0,children:d.map((e=>{return(0,m.jsxs)(i.Ay,{onClick:()=>A(e.id),sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,m.jsx)(s.A,{children:(0,m.jsx)(k,{sx:{backgroundColor:"primary.lighter"},children:(t=e.type,"CHECK"===t?(0,m.jsx)(le.A,{sx:{color:"primary.darker"}}):(0,m.jsx)(R.A,{sx:{color:"primary.darker"}}))})}),(0,m.jsx)(l.A,{primary:e.name,secondary:e.desc}),C(e)?(0,m.jsx)(a.A,{children:(0,m.jsx)(ee.A,{})}):(0,m.jsxs)(a.A,{sx:{color:"primary.lighter",display:"flex",flexDirection:"column",alignItems:"center"},children:[(0,m.jsx)(z.A,{}),(0,m.jsx)($.A,{children:e.owner})]})]},e.id);var t}))}),f.length>0&&(0,m.jsx)(m.Fragment,{children:(0,m.jsxs)(te.A,{sx:{border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,m.jsx)(re.A,{children:(0,m.jsx)(a.A,{sx:{width:"100%",display:"flex",justifyContent:"center"},children:(0,m.jsx)($.A,{children:"My Public Lists"})})}),(0,m.jsx)(oe.A,{children:(0,m.jsx)(n.A,{dense:!0,children:f.map((e=>(0,m.jsxs)(i.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,m.jsx)(l.A,{primary:e.name}),(0,m.jsx)(ae.A,{variant:"outlined",onClick:()=>A(e.id),"aria-label":"Open list in Edit mode",size:"small",children:"Edit"}),(0,m.jsx)(ae.A,{variant:"outlined",onClick:()=>{return t=e.uuid,void v("/web/public/".concat(t));var t},"aria-label":"Open list in Public mode",size:"small",children:"view"})]},e.id)))})})]})})]})})}},2680:(e,t,r)=>{var o=r(4994);t.A=void 0;var a=o(r(39)),n=r(579);t.A=(0,a.default)([(0,n.jsx)("path",{d:"M8 16h12V4H8zm2.4-6.91 2.07 2.08L17.6 6 19 7.41 12.47 14 9 10.5z",opacity:".3"},"0"),(0,n.jsx)("path",{d:"M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2m0 14H8V4h12zm-7.53-2L9 10.5l1.4-1.41 2.07 2.08L17.6 6 19 7.41zM4 20h14v2H4c-1.1 0-2-.9-2-2V6h2z"},"1")],"LibraryAddCheckTwoTone")},2177:(e,t,r)=>{var o=r(4994);t.A=void 0;var a=o(r(39)),n=r(579);t.A=(0,a.default)((0,n.jsx)("path",{d:"M12 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4m0 2c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4"}),"Person")}}]);
//# sourceMappingURL=518.6fe405fb.chunk.js.map